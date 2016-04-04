package com.familyph.sms.core.data;

import java.util.Locale;

import org.springframework.util.StringUtils;

public class Sort {
	
	public static final Direction DEFAULT_DIRECTION = Direction.ASC;
	
	private final String order;

	public Sort(Order order) {
		// TODO Auto-generated constructor stub
		this.order = order.toString();
	}
	
	public Sort(Direction direction, String propertie) {

		if (propertie == null) {
			throw new IllegalArgumentException("You have to provide at least one property to sort by!");
		}

		this.order = new Order(direction,propertie).toString();
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return order;
	}
	
	public static enum Direction {

		ASC, DESC;

		public static Direction fromString(String value) {

			try {
				return Direction.valueOf(value.toUpperCase(Locale.US));
			} catch (Exception e) {
				throw new IllegalArgumentException(String.format("无效的排序参数，排序参数只能为'desc' or 'asc'", value), e);
			}
		}


		public static Direction fromStringOrNull(String value) {

			try {
				return fromString(value);
			} catch (IllegalArgumentException e) {
				return null;
			}
		}
	}
	
	public static class Order {

		private static final boolean DEFAULT_IGNORE_CASE = false;

		private final Direction direction;
		private final String property;
		private final boolean ignoreCase;


		public Order(Direction direction, String property) {
			this(direction, property, DEFAULT_IGNORE_CASE);
		}

		public Order(String property) {
			this(DEFAULT_DIRECTION, property);
		}


		private Order(Direction direction, String property, boolean ignoreCase) {

			if (!StringUtils.hasText(property)) {
				throw new IllegalArgumentException("Property must not null or empty!");
			}

			this.direction = direction == null ? DEFAULT_DIRECTION : direction;
			this.property = property;
			this.ignoreCase = ignoreCase;

		}


		public Direction getDirection() {
			return direction;
		}


		public String getProperty() {
			return property;
		}


		public boolean isAscending() {
			return this.direction.equals(Direction.ASC);
		}


		@Override
		public String toString() {

			String result = String.format("%s %s", property, direction);

			if (ignoreCase) {
				result += ", ignoring case";
			}

			return result;
		}
	}
	
}
