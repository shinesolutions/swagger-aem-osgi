function New-OrgApacheSlingServletsPostImplHelperChunkCleanUpTaskProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${schedulerPeriodexpression},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyBoolean]]
        ${schedulerPeriodconcurrent},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyInteger]]
        ${chunkPeriodcleanupPeriodage}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.OrgApacheSlingServletsPostImplHelperChunkCleanUpTaskProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.OrgApacheSlingServletsPostImplHelperChunkCleanUpTaskProperties -ArgumentList @(
            ${schedulerPeriodexpression},
            ${schedulerPeriodconcurrent},
            ${chunkPeriodcleanupPeriodage}
        )
    }
}
