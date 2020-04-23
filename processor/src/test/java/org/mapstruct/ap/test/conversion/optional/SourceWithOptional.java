/*
 * Copyright MapStruct Authors.
 *
 * Licensed under the Apache License version 2.0, available at http://www.apache.org/licenses/LICENSE-2.0
 */
package org.mapstruct.ap.test.conversion.optional;

import java.util.Optional;
import java.util.Set;

public class SourceWithOptional {

    private String string;
    private Integer number;

    private Optional<String> optional;

    private Set<Optional<String>> optionalsSet;

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Optional<String> getOptional() {
        return optional;
    }

    public void setOptional(Optional<String> optional) {
        this.optional = optional;
    }

    public Set<Optional<String>> getOptionalsSet() {
        return optionalsSet;
    }

    public void setOptionalsSet(Set<Optional<String>> optionalsSet) {
        this.optionalsSet = optionalsSet;
    }

}
