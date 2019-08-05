function New-ComDayCqWcmCoreImplPagePageInfoAggregatorImplProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${pagePeriodinfoPeriodproviderPeriodpropertyPeriodregexPerioddefault},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${pagePeriodinfoPeriodproviderPeriodpropertyPeriodname}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComDayCqWcmCoreImplPagePageInfoAggregatorImplProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComDayCqWcmCoreImplPagePageInfoAggregatorImplProperties -ArgumentList @(
            ${pagePeriodinfoPeriodproviderPeriodpropertyPeriodregexPerioddefault},
            ${pagePeriodinfoPeriodproviderPeriodpropertyPeriodname}
        )
    }
}
