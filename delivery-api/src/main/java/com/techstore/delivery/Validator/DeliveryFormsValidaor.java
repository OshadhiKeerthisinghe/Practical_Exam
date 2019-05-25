package com.techstore.delivery.Validator;

import com.techstore.delivery.DeliveryForms;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

public class DeliveryFormsValidaor implements Validator {
    @Override
    public boolean supports(Class<?> aClass)
    {
        return aClass == DeliveryForms.class;
    }

    @Override
    public void validate(Object target, Errors errors)
    {
        DeliveryForms deliveryInfo = (DeliveryForms) target;

        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "dfId", "NotEmpty.deliveryForms.dfId");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "itemId", "NotEmpty.deliveryForms.itemId");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "orderId", "NotEmpty.deliveryForms.orderId");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "fullName", "NotEmpty.deliveryForms.fullName");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "phoneNum1", "NotEmpty.deliveryForms.phoneNum1");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "phoneNum2", "NotEmpty.deliveryForms.phoneNum2");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "dAddress", "NotEmpty.deliveryForms.dAddress");

    }
}
