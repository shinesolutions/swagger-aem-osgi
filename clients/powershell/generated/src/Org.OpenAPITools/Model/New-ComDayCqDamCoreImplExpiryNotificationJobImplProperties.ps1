function New-ComDayCqDamCoreImplExpiryNotificationJobImplProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyBoolean]]
        ${cqPerioddamPeriodexpiryPeriodnotificationPeriodschedulerPeriodistimebased},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${cqPerioddamPeriodexpiryPeriodnotificationPeriodschedulerPeriodtimebasedPeriodrule},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyInteger]]
        ${cqPerioddamPeriodexpiryPeriodnotificationPeriodschedulerPeriodperiodPeriodrule},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyBoolean]]
        ${sendUnderscoreemail},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyInteger]]
        ${assetUnderscoreexpiredUnderscorelimit},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyInteger]]
        ${priorUnderscorenotificationUnderscoreseconds},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${cqPerioddamPeriodexpiryPeriodnotificationPeriodurlPeriodprotocol}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComDayCqDamCoreImplExpiryNotificationJobImplProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComDayCqDamCoreImplExpiryNotificationJobImplProperties -ArgumentList @(
            ${cqPerioddamPeriodexpiryPeriodnotificationPeriodschedulerPeriodistimebased},
            ${cqPerioddamPeriodexpiryPeriodnotificationPeriodschedulerPeriodtimebasedPeriodrule},
            ${cqPerioddamPeriodexpiryPeriodnotificationPeriodschedulerPeriodperiodPeriodrule},
            ${sendUnderscoreemail},
            ${assetUnderscoreexpiredUnderscorelimit},
            ${priorUnderscorenotificationUnderscoreseconds},
            ${cqPerioddamPeriodexpiryPeriodnotificationPeriodurlPeriodprotocol}
        )
    }
}
