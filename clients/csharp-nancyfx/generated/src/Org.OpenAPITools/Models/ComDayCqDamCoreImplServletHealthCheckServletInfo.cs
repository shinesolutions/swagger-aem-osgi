using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqDamCoreImplServletHealthCheckServletInfo
    /// </summary>
    public sealed class ComDayCqDamCoreImplServletHealthCheckServletInfo:  IEquatable<ComDayCqDamCoreImplServletHealthCheckServletInfo>
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
        public ComDayCqDamCoreImplServletHealthCheckServletProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqDamCoreImplServletHealthCheckServletInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqDamCoreImplServletHealthCheckServletInfo()
        {
        }

        private ComDayCqDamCoreImplServletHealthCheckServletInfo(string Pid, string Title, string Description, ComDayCqDamCoreImplServletHealthCheckServletProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqDamCoreImplServletHealthCheckServletInfo.
        /// </summary>
        /// <returns>ComDayCqDamCoreImplServletHealthCheckServletInfoBuilder</returns>
        public static ComDayCqDamCoreImplServletHealthCheckServletInfoBuilder Builder()
        {
            return new ComDayCqDamCoreImplServletHealthCheckServletInfoBuilder();
        }

        /// <summary>
        /// Returns ComDayCqDamCoreImplServletHealthCheckServletInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqDamCoreImplServletHealthCheckServletInfoBuilder</returns>
        public ComDayCqDamCoreImplServletHealthCheckServletInfoBuilder With()
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

        public bool Equals(ComDayCqDamCoreImplServletHealthCheckServletInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqDamCoreImplServletHealthCheckServletInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqDamCoreImplServletHealthCheckServletInfo</param>
        /// <param name="right">Compared (ComDayCqDamCoreImplServletHealthCheckServletInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqDamCoreImplServletHealthCheckServletInfo left, ComDayCqDamCoreImplServletHealthCheckServletInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqDamCoreImplServletHealthCheckServletInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqDamCoreImplServletHealthCheckServletInfo</param>
        /// <param name="right">Compared (ComDayCqDamCoreImplServletHealthCheckServletInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqDamCoreImplServletHealthCheckServletInfo left, ComDayCqDamCoreImplServletHealthCheckServletInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqDamCoreImplServletHealthCheckServletInfo.
        /// </summary>
        public sealed class ComDayCqDamCoreImplServletHealthCheckServletInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComDayCqDamCoreImplServletHealthCheckServletProperties _Properties;

            internal ComDayCqDamCoreImplServletHealthCheckServletInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqDamCoreImplServletHealthCheckServletInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComDayCqDamCoreImplServletHealthCheckServletInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqDamCoreImplServletHealthCheckServletInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComDayCqDamCoreImplServletHealthCheckServletInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqDamCoreImplServletHealthCheckServletInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComDayCqDamCoreImplServletHealthCheckServletInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqDamCoreImplServletHealthCheckServletInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComDayCqDamCoreImplServletHealthCheckServletInfoBuilder Properties(ComDayCqDamCoreImplServletHealthCheckServletProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqDamCoreImplServletHealthCheckServletInfo.
            /// </summary>
            /// <returns>ComDayCqDamCoreImplServletHealthCheckServletInfo</returns>
            public ComDayCqDamCoreImplServletHealthCheckServletInfo Build()
            {
                Validate();
                return new ComDayCqDamCoreImplServletHealthCheckServletInfo(
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