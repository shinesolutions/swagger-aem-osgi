function New-ComDayCqDamCoreImplMissingMetadataNotificationJobProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyBoolean]]
        ${cqPerioddamPeriodmissingmetadataPeriodnotificationPeriodschedulerPeriodistimebased},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${cqPerioddamPeriodmissingmetadataPeriodnotificationPeriodschedulerPeriodtimebasedPeriodrule},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyInteger]]
        ${cqPerioddamPeriodmissingmetadataPeriodnotificationPeriodschedulerPeriodperiodPeriodrule},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${cqPerioddamPeriodmissingmetadataPeriodnotificationPeriodrecipient}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComDayCqDamCoreImplMissingMetadataNotificationJobProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComDayCqDamCoreImplMissingMetadataNotificationJobProperties -ArgumentList @(
            ${cqPerioddamPeriodmissingmetadataPeriodnotificationPeriodschedulerPeriodistimebased},
            ${cqPerioddamPeriodmissingmetadataPeriodnotificationPeriodschedulerPeriodtimebasedPeriodrule},
            ${cqPerioddamPeriodmissingmetadataPeriodnotificationPeriodschedulerPeriodperiodPeriodrule},
            ${cqPerioddamPeriodmissingmetadataPeriodnotificationPeriodrecipient}
        )
    }
}
