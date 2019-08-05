function New-ComAdobeGraniteCommentsInternalCommentReplicationContentFilterFacProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyArray]]
        ${replicatePeriodcommentPeriodresourceTypes}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComAdobeGraniteCommentsInternalCommentReplicationContentFilterFacProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComAdobeGraniteCommentsInternalCommentReplicationContentFilterFacProperties -ArgumentList @(
            ${replicatePeriodcommentPeriodresourceTypes}
        )
    }
}
