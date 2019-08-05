using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqDamCoreImplLightboxLightboxServletInfo
    /// </summary>
    public sealed class ComDayCqDamCoreImplLightboxLightboxServletInfo:  IEquatable<ComDayCqDamCoreImplLightboxLightboxServletInfo>
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
        public ComDayCqDamCoreImplLightboxLightboxServletProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqDamCoreImplLightboxLightboxServletInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqDamCoreImplLightboxLightboxServletInfo()
        {
        }

        private ComDayCqDamCoreImplLightboxLightboxServletInfo(string Pid, string Title, string Description, ComDayCqDamCoreImplLightboxLightboxServletProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqDamCoreImplLightboxLightboxServletInfo.
        /// </summary>
        /// <returns>ComDayCqDamCoreImplLightboxLightboxServletInfoBuilder</returns>
        public static ComDayCqDamCoreImplLightboxLightboxServletInfoBuilder Builder()
        {
            return new ComDayCqDamCoreImplLightboxLightboxServletInfoBuilder();
        }

        /// <summary>
        /// Returns ComDayCqDamCoreImplLightboxLightboxServletInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqDamCoreImplLightboxLightboxServletInfoBuilder</returns>
        public ComDayCqDamCoreImplLightboxLightboxServletInfoBuilder With()
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

        public bool Equals(ComDayCqDamCoreImplLightboxLightboxServletInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqDamCoreImplLightboxLightboxServletInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqDamCoreImplLightboxLightboxServletInfo</param>
        /// <param name="right">Compared (ComDayCqDamCoreImplLightboxLightboxServletInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqDamCoreImplLightboxLightboxServletInfo left, ComDayCqDamCoreImplLightboxLightboxServletInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqDamCoreImplLightboxLightboxServletInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqDamCoreImplLightboxLightboxServletInfo</param>
        /// <param name="right">Compared (ComDayCqDamCoreImplLightboxLightboxServletInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqDamCoreImplLightboxLightboxServletInfo left, ComDayCqDamCoreImplLightboxLightboxServletInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqDamCoreImplLightboxLightboxServletInfo.
        /// </summary>
        public sealed class ComDayCqDamCoreImplLightboxLightboxServletInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComDayCqDamCoreImplLightboxLightboxServletProperties _Properties;

            internal ComDayCqDamCoreImplLightboxLightboxServletInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqDamCoreImplLightboxLightboxServletInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComDayCqDamCoreImplLightboxLightboxServletInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqDamCoreImplLightboxLightboxServletInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComDayCqDamCoreImplLightboxLightboxServletInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqDamCoreImplLightboxLightboxServletInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComDayCqDamCoreImplLightboxLightboxServletInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqDamCoreImplLightboxLightboxServletInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComDayCqDamCoreImplLightboxLightboxServletInfoBuilder Properties(ComDayCqDamCoreImplLightboxLightboxServletProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqDamCoreImplLightboxLightboxServletInfo.
            /// </summary>
            /// <returns>ComDayCqDamCoreImplLightboxLightboxServletInfo</returns>
            public ComDayCqDamCoreImplLightboxLightboxServletInfo Build()
            {
                Validate();
                return new ComDayCqDamCoreImplLightboxLightboxServletInfo(
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