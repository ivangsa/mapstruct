/*
 * Copyright MapStruct Authors.
 *
 * Licensed under the Apache License version 2.0, available at http://www.apache.org/licenses/LICENSE-2.0
 */
package org.mapstruct.ap.test.conversion.optional;

import java.util.Set;

public class TargetWithPlainValues {

    private String string;
    private String number;

    private String optional;

    private Set<String> optionalsSet;

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getOptional() {
        return optional;
    }

    public void setOptional(String optional) {
        this.optional = optional;
    }

    public Set<String> getOptionalsSet() {
        return optionalsSet;
    }

    public void setOptionalsSet(Set<String> optionalsSet) {
        this.optionalsSet = optionalsSet;
    }

}
