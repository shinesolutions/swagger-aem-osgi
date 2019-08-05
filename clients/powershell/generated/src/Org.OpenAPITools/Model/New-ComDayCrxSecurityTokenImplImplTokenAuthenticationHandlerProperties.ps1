function New-ComDayCrxSecurityTokenImplImplTokenAuthenticationHandlerProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${path},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyDropDown]]
        ${tokenPeriodrequiredPeriodattr},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${tokenPeriodalternatePeriodurl},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyBoolean]]
        ${tokenPeriodencapsulated},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyArray]]
        ${skipPeriodtokenPeriodrefresh}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComDayCrxSecurityTokenImplImplTokenAuthenticationHandlerProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComDayCrxSecurityTokenImplImplTokenAuthenticationHandlerProperties -ArgumentList @(
            ${path},
            ${tokenPeriodrequiredPeriodattr},
            ${tokenPeriodalternatePeriodurl},
            ${tokenPeriodencapsulated},
            ${skipPeriodtokenPeriodrefresh}
        )
    }
}
