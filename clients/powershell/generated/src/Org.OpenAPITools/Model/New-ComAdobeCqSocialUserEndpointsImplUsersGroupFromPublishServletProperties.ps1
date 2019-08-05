function New-ComAdobeCqSocialUserEndpointsImplUsersGroupFromPublishServletProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${slingPeriodservletPeriodextensions},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${slingPeriodservletPeriodpaths},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${slingPeriodservletPeriodmethods}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComAdobeCqSocialUserEndpointsImplUsersGroupFromPublishServletProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComAdobeCqSocialUserEndpointsImplUsersGroupFromPublishServletProperties -ArgumentList @(
            ${slingPeriodservletPeriodextensions},
            ${slingPeriodservletPeriodpaths},
            ${slingPeriodservletPeriodmethods}
        )
    }
}
