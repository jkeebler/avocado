/*
 * Copyright (c) 2013. Regents of the University of California
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.bdgenomics.avocado.calls.reads

import org.bdgenomics.avocado.calls.VariantCall
import org.apache.spark.{ SparkContext, Logging }
import org.apache.spark.rdd.RDD
import org.bdgenomics.adam.avro.ADAMRecord
import org.bdgenomics.adam.models.ADAMVariantContext

/**
 * Abstract class for calling variants on reads.
 */
abstract class ReadCall extends VariantCall {

  /**
   * Method signature for variant calling operation.
   *
   * @param[in] pileupGroups An RDD containing reads.
   * @return An RDD containing called variants.
   */
  def call(pileupGroups: RDD[ADAMRecord]): RDD[ADAMVariantContext]

}

