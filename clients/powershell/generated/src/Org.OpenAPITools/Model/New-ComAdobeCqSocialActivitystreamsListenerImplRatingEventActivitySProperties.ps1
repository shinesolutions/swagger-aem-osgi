function New-ComAdobeCqSocialActivitystreamsListenerImplRatingEventActivitySProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyInteger]]
        ${ranking},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyBoolean]]
        ${enable}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComAdobeCqSocialActivitystreamsListenerImplRatingEventActivitySProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComAdobeCqSocialActivitystreamsListenerImplRatingEventActivitySProperties -ArgumentList @(
            ${ranking},
            ${enable}
        )
    }
}
