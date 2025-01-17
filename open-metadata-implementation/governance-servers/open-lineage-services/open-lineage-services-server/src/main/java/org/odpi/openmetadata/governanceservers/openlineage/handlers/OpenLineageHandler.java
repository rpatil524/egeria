/* SPDX-License-Identifier: Apache-2.0 */
/* Copyright Contributors to the ODPi Egeria project. */
package org.odpi.openmetadata.governanceservers.openlineage.handlers;

import org.odpi.openmetadata.governanceservers.openlineage.OpenLineageQueryService;
import org.odpi.openmetadata.governanceservers.openlineage.ffdc.OpenLineageException;
import org.odpi.openmetadata.governanceservers.openlineage.model.Scope;
import org.odpi.openmetadata.governanceservers.openlineage.responses.LineageResponse;
import org.odpi.openmetadata.governanceservers.openlineage.responses.LineageVertexResponse;

public class OpenLineageHandler {

    private OpenLineageQueryService lineageGraph;

    public OpenLineageHandler(OpenLineageQueryService lineageGraph) {
        this.lineageGraph = lineageGraph;
    }

    /**
     * Returns a lineage subgraph.
     *
     * @param scope                  source-and-destination, end-to-end, ultimate-source, ultimate-destination, glossary.
     * @param guid                   The guid of the node of which the lineage is queried from.
     * @param includeProcesses
     * @return A subgraph containing all relevant paths, in graphSON format.
     */
    public LineageResponse lineage(Scope scope, String guid, boolean includeProcesses) throws OpenLineageException {
        return lineageGraph.lineage(scope, guid, includeProcesses);
    }

    /**
     * Gets entity details.
     *
     * @param guid the guid
     * @return the entity details
     */
    public LineageVertexResponse getEntityDetails(String guid) {
        return lineageGraph.getEntityDetails(guid);
    }
}
