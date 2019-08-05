using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqDamStockIntegrationImplConfigurationStockConfigurationInfo
    /// </summary>
    public sealed class ComDayCqDamStockIntegrationImplConfigurationStockConfigurationInfo:  IEquatable<ComDayCqDamStockIntegrationImplConfigurationStockConfigurationInfo>
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
        public ComDayCqDamStockIntegrationImplConfigurationStockConfigurationProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqDamStockIntegrationImplConfigurationStockConfigurationInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqDamStockIntegrationImplConfigurationStockConfigurationInfo()
        {
        }

        private ComDayCqDamStockIntegrationImplConfigurationStockConfigurationInfo(string Pid, string Title, string Description, ComDayCqDamStockIntegrationImplConfigurationStockConfigurationProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqDamStockIntegrationImplConfigurationStockConfigurationInfo.
        /// </summary>
        /// <returns>ComDayCqDamStockIntegrationImplConfigurationStockConfigurationInfoBuilder</returns>
        public static ComDayCqDamStockIntegrationImplConfigurationStockConfigurationInfoBuilder Builder()
        {
            return new ComDayCqDamStockIntegrationImplConfigurationStockConfigurationInfoBuilder();
        }

        /// <summary>
        /// Returns ComDayCqDamStockIntegrationImplConfigurationStockConfigurationInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqDamStockIntegrationImplConfigurationStockConfigurationInfoBuilder</returns>
        public ComDayCqDamStockIntegrationImplConfigurationStockConfigurationInfoBuilder With()
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

        public bool Equals(ComDayCqDamStockIntegrationImplConfigurationStockConfigurationInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqDamStockIntegrationImplConfigurationStockConfigurationInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqDamStockIntegrationImplConfigurationStockConfigurationInfo</param>
        /// <param name="right">Compared (ComDayCqDamStockIntegrationImplConfigurationStockConfigurationInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqDamStockIntegrationImplConfigurationStockConfigurationInfo left, ComDayCqDamStockIntegrationImplConfigurationStockConfigurationInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqDamStockIntegrationImplConfigurationStockConfigurationInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqDamStockIntegrationImplConfigurationStockConfigurationInfo</param>
        /// <param name="right">Compared (ComDayCqDamStockIntegrationImplConfigurationStockConfigurationInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqDamStockIntegrationImplConfigurationStockConfigurationInfo left, ComDayCqDamStockIntegrationImplConfigurationStockConfigurationInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqDamStockIntegrationImplConfigurationStockConfigurationInfo.
        /// </summary>
        public sealed class ComDayCqDamStockIntegrationImplConfigurationStockConfigurationInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComDayCqDamStockIntegrationImplConfigurationStockConfigurationProperties _Properties;

            internal ComDayCqDamStockIntegrationImplConfigurationStockConfigurationInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqDamStockIntegrationImplConfigurationStockConfigurationInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComDayCqDamStockIntegrationImplConfigurationStockConfigurationInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqDamStockIntegrationImplConfigurationStockConfigurationInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComDayCqDamStockIntegrationImplConfigurationStockConfigurationInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqDamStockIntegrationImplConfigurationStockConfigurationInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComDayCqDamStockIntegrationImplConfigurationStockConfigurationInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqDamStockIntegrationImplConfigurationStockConfigurationInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComDayCqDamStockIntegrationImplConfigurationStockConfigurationInfoBuilder Properties(ComDayCqDamStockIntegrationImplConfigurationStockConfigurationProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqDamStockIntegrationImplConfigurationStockConfigurationInfo.
            /// </summary>
            /// <returns>ComDayCqDamStockIntegrationImplConfigurationStockConfigurationInfo</returns>
            public ComDayCqDamStockIntegrationImplConfigurationStockConfigurationInfo Build()
            {
                Validate();
                return new ComDayCqDamStockIntegrationImplConfigurationStockConfigurationInfo(
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