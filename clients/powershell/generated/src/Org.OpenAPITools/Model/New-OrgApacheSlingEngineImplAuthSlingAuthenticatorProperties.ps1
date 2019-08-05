function New-OrgApacheSlingEngineImplAuthSlingAuthenticatorProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${osgiPeriodhttpPeriodwhiteboardPeriodcontextPeriodselect},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${osgiPeriodhttpPeriodwhiteboardPeriodlistener},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${authPeriodsudoPeriodcookie},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${authPeriodsudoPeriodparameter},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyBoolean]]
        ${authPeriodannonymous},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyArray]]
        ${slingPeriodauthPeriodrequirements},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${slingPeriodauthPeriodanonymousPerioduser},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${slingPeriodauthPeriodanonymousPeriodpassword},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyDropDown]]
        ${authPeriodhttp},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${authPeriodhttpPeriodrealm},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyArray]]
        ${authPerioduriPeriodsuffix}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.OrgApacheSlingEngineImplAuthSlingAuthenticatorProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.OrgApacheSlingEngineImplAuthSlingAuthenticatorProperties -ArgumentList @(
            ${osgiPeriodhttpPeriodwhiteboardPeriodcontextPeriodselect},
            ${osgiPeriodhttpPeriodwhiteboardPeriodlistener},
            ${authPeriodsudoPeriodcookie},
            ${authPeriodsudoPeriodparameter},
            ${authPeriodannonymous},
            ${slingPeriodauthPeriodrequirements},
            ${slingPeriodauthPeriodanonymousPerioduser},
            ${slingPeriodauthPeriodanonymousPeriodpassword},
            ${authPeriodhttp},
            ${authPeriodhttpPeriodrealm},
            ${authPerioduriPeriodsuffix}
        )
    }
}
