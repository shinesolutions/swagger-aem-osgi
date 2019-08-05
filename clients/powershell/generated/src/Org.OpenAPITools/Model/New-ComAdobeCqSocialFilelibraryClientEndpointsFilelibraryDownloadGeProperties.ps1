function New-ComAdobeCqSocialFilelibraryClientEndpointsFilelibraryDownloadGeProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${slingPeriodservletPeriodselectors},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${slingPeriodservletPeriodextensions}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComAdobeCqSocialFilelibraryClientEndpointsFilelibraryDownloadGeProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComAdobeCqSocialFilelibraryClientEndpointsFilelibraryDownloadGeProperties -ArgumentList @(
            ${slingPeriodservletPeriodselectors},
            ${slingPeriodservletPeriodextensions}
        )
    }
}
