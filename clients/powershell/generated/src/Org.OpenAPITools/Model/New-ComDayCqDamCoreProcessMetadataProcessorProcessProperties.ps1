function New-ComDayCqDamCoreProcessMetadataProcessorProcessProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${processPeriodlabel},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyBoolean]]
        ${cqPerioddamPeriodenablePeriodsha1},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyArray]]
        ${cqPerioddamPeriodmetadataPeriodxssprotectedPeriodproperties}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComDayCqDamCoreProcessMetadataProcessorProcessProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComDayCqDamCoreProcessMetadataProcessorProcessProperties -ArgumentList @(
            ${processPeriodlabel},
            ${cqPerioddamPeriodenablePeriodsha1},
            ${cqPerioddamPeriodmetadataPeriodxssprotectedPeriodproperties}
        )
    }
}
