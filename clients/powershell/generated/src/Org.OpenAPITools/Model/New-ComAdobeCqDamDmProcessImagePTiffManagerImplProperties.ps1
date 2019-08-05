function New-ComAdobeCqDamDmProcessImagePTiffManagerImplProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyInteger]]
        ${maxMemory}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComAdobeCqDamDmProcessImagePTiffManagerImplProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComAdobeCqDamDmProcessImagePTiffManagerImplProperties -ArgumentList @(
            ${maxMemory}
        )
    }
}
