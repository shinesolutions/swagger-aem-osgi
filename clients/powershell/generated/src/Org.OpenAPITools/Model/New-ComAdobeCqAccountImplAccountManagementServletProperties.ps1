function New-ComAdobeCqAccountImplAccountManagementServletProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${cqPeriodaccountmanagerPeriodconfigPeriodinformnewaccountPeriodmail},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${cqPeriodaccountmanagerPeriodconfigPeriodinformnewpwdPeriodmail}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComAdobeCqAccountImplAccountManagementServletProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComAdobeCqAccountImplAccountManagementServletProperties -ArgumentList @(
            ${cqPeriodaccountmanagerPeriodconfigPeriodinformnewaccountPeriodmail},
            ${cqPeriodaccountmanagerPeriodconfigPeriodinformnewpwdPeriodmail}
        )
    }
}
