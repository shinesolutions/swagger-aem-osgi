using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqDamCoreImplAssethomeAssetHomePageConfigurationInfo
    /// </summary>
    public sealed class ComDayCqDamCoreImplAssethomeAssetHomePageConfigurationInfo:  IEquatable<ComDayCqDamCoreImplAssethomeAssetHomePageConfigurationInfo>
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
        public ComDayCqDamCoreImplAssethomeAssetHomePageConfigurationProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqDamCoreImplAssethomeAssetHomePageConfigurationInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqDamCoreImplAssethomeAssetHomePageConfigurationInfo()
        {
        }

        private ComDayCqDamCoreImplAssethomeAssetHomePageConfigurationInfo(string Pid, string Title, string Description, ComDayCqDamCoreImplAssethomeAssetHomePageConfigurationProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqDamCoreImplAssethomeAssetHomePageConfigurationInfo.
        /// </summary>
        /// <returns>ComDayCqDamCoreImplAssethomeAssetHomePageConfigurationInfoBuilder</returns>
        public static ComDayCqDamCoreImplAssethomeAssetHomePageConfigurationInfoBuilder Builder()
        {
            return new ComDayCqDamCoreImplAssethomeAssetHomePageConfigurationInfoBuilder();
        }

        /// <summary>
        /// Returns ComDayCqDamCoreImplAssethomeAssetHomePageConfigurationInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqDamCoreImplAssethomeAssetHomePageConfigurationInfoBuilder</returns>
        public ComDayCqDamCoreImplAssethomeAssetHomePageConfigurationInfoBuilder With()
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

        public bool Equals(ComDayCqDamCoreImplAssethomeAssetHomePageConfigurationInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqDamCoreImplAssethomeAssetHomePageConfigurationInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqDamCoreImplAssethomeAssetHomePageConfigurationInfo</param>
        /// <param name="right">Compared (ComDayCqDamCoreImplAssethomeAssetHomePageConfigurationInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqDamCoreImplAssethomeAssetHomePageConfigurationInfo left, ComDayCqDamCoreImplAssethomeAssetHomePageConfigurationInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqDamCoreImplAssethomeAssetHomePageConfigurationInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqDamCoreImplAssethomeAssetHomePageConfigurationInfo</param>
        /// <param name="right">Compared (ComDayCqDamCoreImplAssethomeAssetHomePageConfigurationInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqDamCoreImplAssethomeAssetHomePageConfigurationInfo left, ComDayCqDamCoreImplAssethomeAssetHomePageConfigurationInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqDamCoreImplAssethomeAssetHomePageConfigurationInfo.
        /// </summary>
        public sealed class ComDayCqDamCoreImplAssethomeAssetHomePageConfigurationInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComDayCqDamCoreImplAssethomeAssetHomePageConfigurationProperties _Properties;

            internal ComDayCqDamCoreImplAssethomeAssetHomePageConfigurationInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqDamCoreImplAssethomeAssetHomePageConfigurationInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComDayCqDamCoreImplAssethomeAssetHomePageConfigurationInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqDamCoreImplAssethomeAssetHomePageConfigurationInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComDayCqDamCoreImplAssethomeAssetHomePageConfigurationInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqDamCoreImplAssethomeAssetHomePageConfigurationInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComDayCqDamCoreImplAssethomeAssetHomePageConfigurationInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqDamCoreImplAssethomeAssetHomePageConfigurationInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComDayCqDamCoreImplAssethomeAssetHomePageConfigurationInfoBuilder Properties(ComDayCqDamCoreImplAssethomeAssetHomePageConfigurationProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqDamCoreImplAssethomeAssetHomePageConfigurationInfo.
            /// </summary>
            /// <returns>ComDayCqDamCoreImplAssethomeAssetHomePageConfigurationInfo</returns>
            public ComDayCqDamCoreImplAssethomeAssetHomePageConfigurationInfo Build()
            {
                Validate();
                return new ComDayCqDamCoreImplAssethomeAssetHomePageConfigurationInfo(
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