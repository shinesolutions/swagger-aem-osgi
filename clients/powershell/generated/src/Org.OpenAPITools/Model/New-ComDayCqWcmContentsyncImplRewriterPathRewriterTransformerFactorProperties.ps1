function New-ComDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyArray]]
        ${cqPeriodcontentsyncPeriodpathrewritertransformerPeriodmappingPeriodlinks},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyArray]]
        ${cqPeriodcontentsyncPeriodpathrewritertransformerPeriodmappingPeriodclientlibs},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyArray]]
        ${cqPeriodcontentsyncPeriodpathrewritertransformerPeriodmappingPeriodimages},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${cqPeriodcontentsyncPeriodpathrewritertransformerPeriodattributePeriodpattern},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${cqPeriodcontentsyncPeriodpathrewritertransformerPeriodclientlibraryPeriodpattern},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${cqPeriodcontentsyncPeriodpathrewritertransformerPeriodclientlibraryPeriodreplace}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComDayCqWcmContentsyncImplRewriterPathRewriterTransformerFactorProperties -ArgumentList @(
            ${cqPeriodcontentsyncPeriodpathrewritertransformerPeriodmappingPeriodlinks},
            ${cqPeriodcontentsyncPeriodpathrewritertransformerPeriodmappingPeriodclientlibs},
            ${cqPeriodcontentsyncPeriodpathrewritertransformerPeriodmappingPeriodimages},
            ${cqPeriodcontentsyncPeriodpathrewritertransformerPeriodattributePeriodpattern},
            ${cqPeriodcontentsyncPeriodpathrewritertransformerPeriodclientlibraryPeriodpattern},
            ${cqPeriodcontentsyncPeriodpathrewritertransformerPeriodclientlibraryPeriodreplace}
        )
    }
}
