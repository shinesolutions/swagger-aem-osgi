function New-ComAdobeCqAccountApiAccountManagementServiceProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyInteger]]
        ${cqPeriodaccountmanagerPeriodtokenPeriodvalidityPeriodperiod},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${cqPeriodaccountmanagerPeriodconfigPeriodrequestnewaccountPeriodmail},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${cqPeriodaccountmanagerPeriodconfigPeriodrequestnewpwdPeriodmail}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComAdobeCqAccountApiAccountManagementServiceProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComAdobeCqAccountApiAccountManagementServiceProperties -ArgumentList @(
            ${cqPeriodaccountmanagerPeriodtokenPeriodvalidityPeriodperiod},
            ${cqPeriodaccountmanagerPeriodconfigPeriodrequestnewaccountPeriodmail},
            ${cqPeriodaccountmanagerPeriodconfigPeriodrequestnewpwdPeriodmail}
        )
    }
}
