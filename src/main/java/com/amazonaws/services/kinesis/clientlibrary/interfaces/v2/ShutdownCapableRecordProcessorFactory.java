/*
 * Copyright 2012-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Amazon Software License (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 * http://aws.amazon.com/asl/
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.kinesis.clientlibrary.interfaces.v2;


/**
 * A {@link IRecordProcessorFactory} that provides implementors the capability to shutdown when the worker shuts down
 */
public interface ShutdownCapableRecordProcessorFactory extends IRecordProcessorFactory {

    /**
     * Shuts down all running processors
     */
    void shutdownProcessors();
}
