using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqDamCoreImplServletAssetXMPSearchServletInfo
    /// </summary>
    public sealed class ComDayCqDamCoreImplServletAssetXMPSearchServletInfo:  IEquatable<ComDayCqDamCoreImplServletAssetXMPSearchServletInfo>
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
        public ComDayCqDamCoreImplServletAssetXMPSearchServletProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqDamCoreImplServletAssetXMPSearchServletInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqDamCoreImplServletAssetXMPSearchServletInfo()
        {
        }

        private ComDayCqDamCoreImplServletAssetXMPSearchServletInfo(string Pid, string Title, string Description, ComDayCqDamCoreImplServletAssetXMPSearchServletProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqDamCoreImplServletAssetXMPSearchServletInfo.
        /// </summary>
        /// <returns>ComDayCqDamCoreImplServletAssetXMPSearchServletInfoBuilder</returns>
        public static ComDayCqDamCoreImplServletAssetXMPSearchServletInfoBuilder Builder()
        {
            return new ComDayCqDamCoreImplServletAssetXMPSearchServletInfoBuilder();
        }

        /// <summary>
        /// Returns ComDayCqDamCoreImplServletAssetXMPSearchServletInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqDamCoreImplServletAssetXMPSearchServletInfoBuilder</returns>
        public ComDayCqDamCoreImplServletAssetXMPSearchServletInfoBuilder With()
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

        public bool Equals(ComDayCqDamCoreImplServletAssetXMPSearchServletInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqDamCoreImplServletAssetXMPSearchServletInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqDamCoreImplServletAssetXMPSearchServletInfo</param>
        /// <param name="right">Compared (ComDayCqDamCoreImplServletAssetXMPSearchServletInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqDamCoreImplServletAssetXMPSearchServletInfo left, ComDayCqDamCoreImplServletAssetXMPSearchServletInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqDamCoreImplServletAssetXMPSearchServletInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqDamCoreImplServletAssetXMPSearchServletInfo</param>
        /// <param name="right">Compared (ComDayCqDamCoreImplServletAssetXMPSearchServletInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqDamCoreImplServletAssetXMPSearchServletInfo left, ComDayCqDamCoreImplServletAssetXMPSearchServletInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqDamCoreImplServletAssetXMPSearchServletInfo.
        /// </summary>
        public sealed class ComDayCqDamCoreImplServletAssetXMPSearchServletInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComDayCqDamCoreImplServletAssetXMPSearchServletProperties _Properties;

            internal ComDayCqDamCoreImplServletAssetXMPSearchServletInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqDamCoreImplServletAssetXMPSearchServletInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComDayCqDamCoreImplServletAssetXMPSearchServletInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqDamCoreImplServletAssetXMPSearchServletInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComDayCqDamCoreImplServletAssetXMPSearchServletInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqDamCoreImplServletAssetXMPSearchServletInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComDayCqDamCoreImplServletAssetXMPSearchServletInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqDamCoreImplServletAssetXMPSearchServletInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComDayCqDamCoreImplServletAssetXMPSearchServletInfoBuilder Properties(ComDayCqDamCoreImplServletAssetXMPSearchServletProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqDamCoreImplServletAssetXMPSearchServletInfo.
            /// </summary>
            /// <returns>ComDayCqDamCoreImplServletAssetXMPSearchServletInfo</returns>
            public ComDayCqDamCoreImplServletAssetXMPSearchServletInfo Build()
            {
                Validate();
                return new ComDayCqDamCoreImplServletAssetXMPSearchServletInfo(
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