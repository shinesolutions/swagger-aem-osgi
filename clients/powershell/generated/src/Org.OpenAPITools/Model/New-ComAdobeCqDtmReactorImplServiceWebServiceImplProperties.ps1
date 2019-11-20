function New-ComAdobeCqDtmReactorImplServiceWebServiceImplProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${endpointUri},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyInteger]]
        ${connectionTimeout},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyInteger]]
        ${socketTimeout}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComAdobeCqDtmReactorImplServiceWebServiceImplProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComAdobeCqDtmReactorImplServiceWebServiceImplProperties -ArgumentList @(
            ${endpointUri},
            ${connectionTimeout},
            ${socketTimeout}
        )
    }
}