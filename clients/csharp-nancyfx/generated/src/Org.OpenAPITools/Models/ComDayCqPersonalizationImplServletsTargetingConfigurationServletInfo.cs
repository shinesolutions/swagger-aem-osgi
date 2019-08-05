using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqPersonalizationImplServletsTargetingConfigurationServletInfo
    /// </summary>
    public sealed class ComDayCqPersonalizationImplServletsTargetingConfigurationServletInfo:  IEquatable<ComDayCqPersonalizationImplServletsTargetingConfigurationServletInfo>
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
        public ComDayCqPersonalizationImplServletsTargetingConfigurationServletProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqPersonalizationImplServletsTargetingConfigurationServletInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqPersonalizationImplServletsTargetingConfigurationServletInfo()
        {
        }

        private ComDayCqPersonalizationImplServletsTargetingConfigurationServletInfo(string Pid, string Title, string Description, ComDayCqPersonalizationImplServletsTargetingConfigurationServletProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqPersonalizationImplServletsTargetingConfigurationServletInfo.
        /// </summary>
        /// <returns>ComDayCqPersonalizationImplServletsTargetingConfigurationServletInfoBuilder</returns>
        public static ComDayCqPersonalizationImplServletsTargetingConfigurationServletInfoBuilder Builder()
        {
            return new ComDayCqPersonalizationImplServletsTargetingConfigurationServletInfoBuilder();
        }

        /// <summary>
        /// Returns ComDayCqPersonalizationImplServletsTargetingConfigurationServletInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqPersonalizationImplServletsTargetingConfigurationServletInfoBuilder</returns>
        public ComDayCqPersonalizationImplServletsTargetingConfigurationServletInfoBuilder With()
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

        public bool Equals(ComDayCqPersonalizationImplServletsTargetingConfigurationServletInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqPersonalizationImplServletsTargetingConfigurationServletInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqPersonalizationImplServletsTargetingConfigurationServletInfo</param>
        /// <param name="right">Compared (ComDayCqPersonalizationImplServletsTargetingConfigurationServletInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqPersonalizationImplServletsTargetingConfigurationServletInfo left, ComDayCqPersonalizationImplServletsTargetingConfigurationServletInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqPersonalizationImplServletsTargetingConfigurationServletInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqPersonalizationImplServletsTargetingConfigurationServletInfo</param>
        /// <param name="right">Compared (ComDayCqPersonalizationImplServletsTargetingConfigurationServletInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqPersonalizationImplServletsTargetingConfigurationServletInfo left, ComDayCqPersonalizationImplServletsTargetingConfigurationServletInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqPersonalizationImplServletsTargetingConfigurationServletInfo.
        /// </summary>
        public sealed class ComDayCqPersonalizationImplServletsTargetingConfigurationServletInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComDayCqPersonalizationImplServletsTargetingConfigurationServletProperties _Properties;

            internal ComDayCqPersonalizationImplServletsTargetingConfigurationServletInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqPersonalizationImplServletsTargetingConfigurationServletInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComDayCqPersonalizationImplServletsTargetingConfigurationServletInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqPersonalizationImplServletsTargetingConfigurationServletInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComDayCqPersonalizationImplServletsTargetingConfigurationServletInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqPersonalizationImplServletsTargetingConfigurationServletInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComDayCqPersonalizationImplServletsTargetingConfigurationServletInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqPersonalizationImplServletsTargetingConfigurationServletInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComDayCqPersonalizationImplServletsTargetingConfigurationServletInfoBuilder Properties(ComDayCqPersonalizationImplServletsTargetingConfigurationServletProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqPersonalizationImplServletsTargetingConfigurationServletInfo.
            /// </summary>
            /// <returns>ComDayCqPersonalizationImplServletsTargetingConfigurationServletInfo</returns>
            public ComDayCqPersonalizationImplServletsTargetingConfigurationServletInfo Build()
            {
                Validate();
                return new ComDayCqPersonalizationImplServletsTargetingConfigurationServletInfo(
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