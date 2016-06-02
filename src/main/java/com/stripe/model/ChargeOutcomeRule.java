package com.stripe.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter @EqualsAndHashCode(callSuper=false)
public class ChargeOutcomeRule extends StripeObject {
	protected String action;
	protected String predicate;
}
