function New-ComAdobeGraniteMaintenanceCrxImplDataStoreGarbageCollectionTaskProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyBoolean]]
        ${granitePeriodmaintenancePeriodmandatory},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${jobPeriodtopics}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComAdobeGraniteMaintenanceCrxImplDataStoreGarbageCollectionTaskProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComAdobeGraniteMaintenanceCrxImplDataStoreGarbageCollectionTaskProperties -ArgumentList @(
            ${granitePeriodmaintenancePeriodmandatory},
            ${jobPeriodtopics}
        )
    }
}
