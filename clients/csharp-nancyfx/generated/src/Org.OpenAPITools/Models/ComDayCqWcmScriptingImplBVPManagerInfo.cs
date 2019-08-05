using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqWcmScriptingImplBVPManagerInfo
    /// </summary>
    public sealed class ComDayCqWcmScriptingImplBVPManagerInfo:  IEquatable<ComDayCqWcmScriptingImplBVPManagerInfo>
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
        public ComDayCqWcmScriptingImplBVPManagerProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqWcmScriptingImplBVPManagerInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqWcmScriptingImplBVPManagerInfo()
        {
        }

        private ComDayCqWcmScriptingImplBVPManagerInfo(string Pid, string Title, string Description, ComDayCqWcmScriptingImplBVPManagerProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqWcmScriptingImplBVPManagerInfo.
        /// </summary>
        /// <returns>ComDayCqWcmScriptingImplBVPManagerInfoBuilder</returns>
        public static ComDayCqWcmScriptingImplBVPManagerInfoBuilder Builder()
        {
            return new ComDayCqWcmScriptingImplBVPManagerInfoBuilder();
        }

        /// <summary>
        /// Returns ComDayCqWcmScriptingImplBVPManagerInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqWcmScriptingImplBVPManagerInfoBuilder</returns>
        public ComDayCqWcmScriptingImplBVPManagerInfoBuilder With()
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

        public bool Equals(ComDayCqWcmScriptingImplBVPManagerInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqWcmScriptingImplBVPManagerInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqWcmScriptingImplBVPManagerInfo</param>
        /// <param name="right">Compared (ComDayCqWcmScriptingImplBVPManagerInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqWcmScriptingImplBVPManagerInfo left, ComDayCqWcmScriptingImplBVPManagerInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqWcmScriptingImplBVPManagerInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqWcmScriptingImplBVPManagerInfo</param>
        /// <param name="right">Compared (ComDayCqWcmScriptingImplBVPManagerInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqWcmScriptingImplBVPManagerInfo left, ComDayCqWcmScriptingImplBVPManagerInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqWcmScriptingImplBVPManagerInfo.
        /// </summary>
        public sealed class ComDayCqWcmScriptingImplBVPManagerInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComDayCqWcmScriptingImplBVPManagerProperties _Properties;

            internal ComDayCqWcmScriptingImplBVPManagerInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqWcmScriptingImplBVPManagerInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComDayCqWcmScriptingImplBVPManagerInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqWcmScriptingImplBVPManagerInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComDayCqWcmScriptingImplBVPManagerInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqWcmScriptingImplBVPManagerInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComDayCqWcmScriptingImplBVPManagerInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqWcmScriptingImplBVPManagerInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComDayCqWcmScriptingImplBVPManagerInfoBuilder Properties(ComDayCqWcmScriptingImplBVPManagerProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqWcmScriptingImplBVPManagerInfo.
            /// </summary>
            /// <returns>ComDayCqWcmScriptingImplBVPManagerInfo</returns>
            public ComDayCqWcmScriptingImplBVPManagerInfo Build()
            {
                Validate();
                return new ComDayCqWcmScriptingImplBVPManagerInfo(
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