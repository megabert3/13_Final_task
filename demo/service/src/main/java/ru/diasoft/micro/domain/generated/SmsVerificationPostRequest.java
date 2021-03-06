/*
 * Created by DQCodegen
 */
package ru.diasoft.micro.domain.generated;

import com.fasterxml.jackson.annotation.JsonFilter;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Generated;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(value = "SmsVerificationPostRequest", description = "")
@JsonFilter("DynamicExclude")
@Generated
public class SmsVerificationPostRequest implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(name = "PhoneNumber", dataType = "String", value = "Номер телефона", required = false, position = 1)
    @JsonProperty("PhoneNumber")
    private String phoneNumber;

}
