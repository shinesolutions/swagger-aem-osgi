function New-ComAdobeCqDamProcessorNuiImplNuiAssetProcessorProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyBoolean]]
        ${nuiEnabled},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${nuiServiceUrl},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${nuiApiKey}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComAdobeCqDamProcessorNuiImplNuiAssetProcessorProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComAdobeCqDamProcessorNuiImplNuiAssetProcessorProperties -ArgumentList @(
            ${nuiEnabled},
            ${nuiServiceUrl},
            ${nuiApiKey}
        )
    }
}
