function New-ComAdobeCqSocialSrpImplSocialSolrConnectorProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${srpPeriodtype}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComAdobeCqSocialSrpImplSocialSolrConnectorProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComAdobeCqSocialSrpImplSocialSolrConnectorProperties -ArgumentList @(
            ${srpPeriodtype}
        )
    }
}
