function New-ComAdobeCqSocialCommonsCorsCORSAuthenticationFilterProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyBoolean]]
        ${corsPeriodenabling}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComAdobeCqSocialCommonsCorsCORSAuthenticationFilterProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComAdobeCqSocialCommonsCorsCORSAuthenticationFilterProperties -ArgumentList @(
            ${corsPeriodenabling}
        )
    }
}
