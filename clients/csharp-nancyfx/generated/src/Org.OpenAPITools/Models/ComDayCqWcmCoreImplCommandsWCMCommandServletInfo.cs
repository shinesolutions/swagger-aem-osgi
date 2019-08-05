using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqWcmCoreImplCommandsWCMCommandServletInfo
    /// </summary>
    public sealed class ComDayCqWcmCoreImplCommandsWCMCommandServletInfo:  IEquatable<ComDayCqWcmCoreImplCommandsWCMCommandServletInfo>
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
        public ComDayCqWcmCoreImplCommandsWCMCommandServletProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqWcmCoreImplCommandsWCMCommandServletInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqWcmCoreImplCommandsWCMCommandServletInfo()
        {
        }

        private ComDayCqWcmCoreImplCommandsWCMCommandServletInfo(string Pid, string Title, string Description, ComDayCqWcmCoreImplCommandsWCMCommandServletProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqWcmCoreImplCommandsWCMCommandServletInfo.
        /// </summary>
        /// <returns>ComDayCqWcmCoreImplCommandsWCMCommandServletInfoBuilder</returns>
        public static ComDayCqWcmCoreImplCommandsWCMCommandServletInfoBuilder Builder()
        {
            return new ComDayCqWcmCoreImplCommandsWCMCommandServletInfoBuilder();
        }

        /// <summary>
        /// Returns ComDayCqWcmCoreImplCommandsWCMCommandServletInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqWcmCoreImplCommandsWCMCommandServletInfoBuilder</returns>
        public ComDayCqWcmCoreImplCommandsWCMCommandServletInfoBuilder With()
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

        public bool Equals(ComDayCqWcmCoreImplCommandsWCMCommandServletInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqWcmCoreImplCommandsWCMCommandServletInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqWcmCoreImplCommandsWCMCommandServletInfo</param>
        /// <param name="right">Compared (ComDayCqWcmCoreImplCommandsWCMCommandServletInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqWcmCoreImplCommandsWCMCommandServletInfo left, ComDayCqWcmCoreImplCommandsWCMCommandServletInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqWcmCoreImplCommandsWCMCommandServletInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqWcmCoreImplCommandsWCMCommandServletInfo</param>
        /// <param name="right">Compared (ComDayCqWcmCoreImplCommandsWCMCommandServletInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqWcmCoreImplCommandsWCMCommandServletInfo left, ComDayCqWcmCoreImplCommandsWCMCommandServletInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqWcmCoreImplCommandsWCMCommandServletInfo.
        /// </summary>
        public sealed class ComDayCqWcmCoreImplCommandsWCMCommandServletInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComDayCqWcmCoreImplCommandsWCMCommandServletProperties _Properties;

            internal ComDayCqWcmCoreImplCommandsWCMCommandServletInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqWcmCoreImplCommandsWCMCommandServletInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComDayCqWcmCoreImplCommandsWCMCommandServletInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqWcmCoreImplCommandsWCMCommandServletInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComDayCqWcmCoreImplCommandsWCMCommandServletInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqWcmCoreImplCommandsWCMCommandServletInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComDayCqWcmCoreImplCommandsWCMCommandServletInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqWcmCoreImplCommandsWCMCommandServletInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComDayCqWcmCoreImplCommandsWCMCommandServletInfoBuilder Properties(ComDayCqWcmCoreImplCommandsWCMCommandServletProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqWcmCoreImplCommandsWCMCommandServletInfo.
            /// </summary>
            /// <returns>ComDayCqWcmCoreImplCommandsWCMCommandServletInfo</returns>
            public ComDayCqWcmCoreImplCommandsWCMCommandServletInfo Build()
            {
                Validate();
                return new ComDayCqWcmCoreImplCommandsWCMCommandServletInfo(
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