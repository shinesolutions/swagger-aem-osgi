function New-ComDayCqAnalyticsImplStorePropertiesChangeListenerProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyArray]]
        ${cqPeriodstorePeriodlistenerPeriodadditionalStorePaths}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComDayCqAnalyticsImplStorePropertiesChangeListenerProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComDayCqAnalyticsImplStorePropertiesChangeListenerProperties -ArgumentList @(
            ${cqPeriodstorePeriodlistenerPeriodadditionalStorePaths}
        )
    }
}
