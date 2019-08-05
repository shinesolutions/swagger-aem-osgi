using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqWcmWorkflowImplWorkflowPackageInfoProviderInfo
    /// </summary>
    public sealed class ComDayCqWcmWorkflowImplWorkflowPackageInfoProviderInfo:  IEquatable<ComDayCqWcmWorkflowImplWorkflowPackageInfoProviderInfo>
    { 
        /// <summary>
        /// Pid
        /// </summary>
        public string Pid { get; private set; }

        /// <summary>
        /// Title
        /// </summary>
        public string Title { get; private set; }

        /// <summary>
        /// Description
        /// </summary>
        public string Description { get; private set; }

        /// <summary>
        /// Properties
        /// </summary>
        public ComDayCqWcmWorkflowImplWorkflowPackageInfoProviderProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqWcmWorkflowImplWorkflowPackageInfoProviderInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqWcmWorkflowImplWorkflowPackageInfoProviderInfo()
        {
        }

        private ComDayCqWcmWorkflowImplWorkflowPackageInfoProviderInfo(string Pid, string Title, string Description, ComDayCqWcmWorkflowImplWorkflowPackageInfoProviderProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqWcmWorkflowImplWorkflowPackageInfoProviderInfo.
        /// </summary>
        /// <returns>ComDayCqWcmWorkflowImplWorkflowPackageInfoProviderInfoBuilder</returns>
        public static ComDayCqWcmWorkflowImplWorkflowPackageInfoProviderInfoBuilder Builder()
        {
            return new ComDayCqWcmWorkflowImplWorkflowPackageInfoProviderInfoBuilder();
        }

        /// <summary>
        /// Returns ComDayCqWcmWorkflowImplWorkflowPackageInfoProviderInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqWcmWorkflowImplWorkflowPackageInfoProviderInfoBuilder</returns>
        public ComDayCqWcmWorkflowImplWorkflowPackageInfoProviderInfoBuilder With()
        {
            return Builder()
                .Pid(Pid)
                .Title(Title)
                .Description(Description)
                .Properties(Properties);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComDayCqWcmWorkflowImplWorkflowPackageInfoProviderInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqWcmWorkflowImplWorkflowPackageInfoProviderInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqWcmWorkflowImplWorkflowPackageInfoProviderInfo</param>
        /// <param name="right">Compared (ComDayCqWcmWorkflowImplWorkflowPackageInfoProviderInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqWcmWorkflowImplWorkflowPackageInfoProviderInfo left, ComDayCqWcmWorkflowImplWorkflowPackageInfoProviderInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqWcmWorkflowImplWorkflowPackageInfoProviderInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqWcmWorkflowImplWorkflowPackageInfoProviderInfo</param>
        /// <param name="right">Compared (ComDayCqWcmWorkflowImplWorkflowPackageInfoProviderInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqWcmWorkflowImplWorkflowPackageInfoProviderInfo left, ComDayCqWcmWorkflowImplWorkflowPackageInfoProviderInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqWcmWorkflowImplWorkflowPackageInfoProviderInfo.
        /// </summary>
        public sealed class ComDayCqWcmWorkflowImplWorkflowPackageInfoProviderInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComDayCqWcmWorkflowImplWorkflowPackageInfoProviderProperties _Properties;

            internal ComDayCqWcmWorkflowImplWorkflowPackageInfoProviderInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqWcmWorkflowImplWorkflowPackageInfoProviderInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComDayCqWcmWorkflowImplWorkflowPackageInfoProviderInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqWcmWorkflowImplWorkflowPackageInfoProviderInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComDayCqWcmWorkflowImplWorkflowPackageInfoProviderInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqWcmWorkflowImplWorkflowPackageInfoProviderInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComDayCqWcmWorkflowImplWorkflowPackageInfoProviderInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqWcmWorkflowImplWorkflowPackageInfoProviderInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComDayCqWcmWorkflowImplWorkflowPackageInfoProviderInfoBuilder Properties(ComDayCqWcmWorkflowImplWorkflowPackageInfoProviderProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqWcmWorkflowImplWorkflowPackageInfoProviderInfo.
            /// </summary>
            /// <returns>ComDayCqWcmWorkflowImplWorkflowPackageInfoProviderInfo</returns>
            public ComDayCqWcmWorkflowImplWorkflowPackageInfoProviderInfo Build()
            {
                Validate();
                return new ComDayCqWcmWorkflowImplWorkflowPackageInfoProviderInfo(
                    Pid: _Pid,
                    Title: _Title,
                    Description: _Description,
                    Properties: _Properties
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}