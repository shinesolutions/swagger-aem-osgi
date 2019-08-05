function New-OrgApacheSlingJcrJackrabbitServerJndiRegistrationSupportProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${javaPeriodnamingPeriodfactoryPeriodinitial},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${javaPeriodnamingPeriodproviderPeriodurl}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.OrgApacheSlingJcrJackrabbitServerJndiRegistrationSupportProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.OrgApacheSlingJcrJackrabbitServerJndiRegistrationSupportProperties -ArgumentList @(
            ${javaPeriodnamingPeriodfactoryPeriodinitial},
            ${javaPeriodnamingPeriodproviderPeriodurl}
        )
    }
}
