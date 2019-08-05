function New-ComAdobeCqSocialGroupImplGroupServiceImplProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyInteger]]
        ${maxWaitTime},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyInteger]]
        ${minWaitBetweenRetries}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComAdobeCqSocialGroupImplGroupServiceImplProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComAdobeCqSocialGroupImplGroupServiceImplProperties -ArgumentList @(
            ${maxWaitTime},
            ${minWaitBetweenRetries}
        )
    }
}
