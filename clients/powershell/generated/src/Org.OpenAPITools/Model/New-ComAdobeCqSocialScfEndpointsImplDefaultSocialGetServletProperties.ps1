function New-ComAdobeCqSocialScfEndpointsImplDefaultSocialGetServletProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyArray]]
        ${slingPeriodservletPeriodselectors},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${slingPeriodservletPeriodextensions}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComAdobeCqSocialScfEndpointsImplDefaultSocialGetServletProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComAdobeCqSocialScfEndpointsImplDefaultSocialGetServletProperties -ArgumentList @(
            ${slingPeriodservletPeriodselectors},
            ${slingPeriodservletPeriodextensions}
        )
    }
}
