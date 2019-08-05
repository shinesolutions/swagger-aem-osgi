function New-MessagingUserComponentFactoryProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyInteger]]
        ${priority}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.MessagingUserComponentFactoryProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.MessagingUserComponentFactoryProperties -ArgumentList @(
            ${priority}
        )
    }
}
