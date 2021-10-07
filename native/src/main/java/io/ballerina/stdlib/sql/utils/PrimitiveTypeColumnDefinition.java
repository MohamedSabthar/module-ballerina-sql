/*
 *  Copyright (c) 2021, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 *  WSO2 Inc. licenses this file to you under the Apache License,
 *  Version 2.0 (the "License"); you may not use this file except
 *  in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing,
 *  software distributed under the License is distributed on an
 *  "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 *  KIND, either express or implied.  See the License for the
 *  specific language governing permissions and limitations
 *  under the License.
 */
package io.ballerina.stdlib.sql.utils;

import io.ballerina.runtime.api.types.Type;

/**
 * This class provides the mapping of the sql columns, its names and types of grouped columns for inner record type.
 **/
public class PrimitiveTypeColumnDefinition extends ColumnDefinition {
    private final String columnName;
    private final int sqlType;
    private final String sqlTypeName;
    private final boolean isNullable;
    private final int resultSetColumnIndex;

    public PrimitiveTypeColumnDefinition(String columnName, int sqlType, String sqlTypeName, boolean isNullable,
                                         int resultSetColumnIndex, String ballerinaFieldName, Type ballerinaType) {
        super(ballerinaFieldName, ballerinaType);
        this.columnName = columnName;
        this.sqlType = sqlType;
        this.sqlTypeName = sqlTypeName;
        this.isNullable = isNullable;
        this.resultSetColumnIndex = resultSetColumnIndex;
    }

    public String getColumnName() {
        return columnName;
    }

    public int getSqlType() {
        return sqlType;
    }

    public String getSqlTypeName() {
        return sqlTypeName;
    }

    public boolean isNullable() {
        return isNullable;
    }

    public int getResultSetColumnIndex() {
        return resultSetColumnIndex;
    }

}
