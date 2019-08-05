function New-ComDayCommonsHttpclientProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyBoolean]]
        ${proxyPeriodenabled},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${proxyPeriodhost},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${proxyPerioduser},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${proxyPeriodpassword},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${proxyPeriodntlmPeriodhost},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${proxyPeriodntlmPerioddomain},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyArray]]
        ${proxyPeriodexceptions}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComDayCommonsHttpclientProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComDayCommonsHttpclientProperties -ArgumentList @(
            ${proxyPeriodenabled},
            ${proxyPeriodhost},
            ${proxyPerioduser},
            ${proxyPeriodpassword},
            ${proxyPeriodntlmPeriodhost},
            ${proxyPeriodntlmPerioddomain},
            ${proxyPeriodexceptions}
        )
    }
}
