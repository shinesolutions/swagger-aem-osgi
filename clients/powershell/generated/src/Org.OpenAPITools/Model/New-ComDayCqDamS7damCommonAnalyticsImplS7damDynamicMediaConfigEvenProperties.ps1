function New-ComDayCqDamS7damCommonAnalyticsImplS7damDynamicMediaConfigEvenProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyBoolean]]
        ${cqPerioddamPeriods7damPerioddynamicmediaconfigeventlistenerPeriodenabled}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComDayCqDamS7damCommonAnalyticsImplS7damDynamicMediaConfigEvenProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComDayCqDamS7damCommonAnalyticsImplS7damDynamicMediaConfigEvenProperties -ArgumentList @(
            ${cqPerioddamPeriods7damPerioddynamicmediaconfigeventlistenerPeriodenabled}
        )
    }
}
