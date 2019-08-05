function New-OrgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyArray]]
        ${datasources},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyInteger]]
        ${step},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyArray]]
        ${archives},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${path}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.OrgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.OrgApacheSlingCommonsMetricsRrd4jImplCodahaleMetricsReporterProperties -ArgumentList @(
            ${datasources},
            ${step},
            ${archives},
            ${path}
        )
    }
}
