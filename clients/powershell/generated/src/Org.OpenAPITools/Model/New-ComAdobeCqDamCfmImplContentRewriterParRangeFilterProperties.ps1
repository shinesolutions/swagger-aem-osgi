function New-ComAdobeCqDamCfmImplContentRewriterParRangeFilterProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${pipelinePeriodtype}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComAdobeCqDamCfmImplContentRewriterParRangeFilterProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComAdobeCqDamCfmImplContentRewriterParRangeFilterProperties -ArgumentList @(
            ${pipelinePeriodtype}
        )
    }
}
