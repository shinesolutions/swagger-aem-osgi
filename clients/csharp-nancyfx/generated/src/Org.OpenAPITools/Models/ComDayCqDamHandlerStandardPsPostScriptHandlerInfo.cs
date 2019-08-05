using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqDamHandlerStandardPsPostScriptHandlerInfo
    /// </summary>
    public sealed class ComDayCqDamHandlerStandardPsPostScriptHandlerInfo:  IEquatable<ComDayCqDamHandlerStandardPsPostScriptHandlerInfo>
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
        public ComDayCqDamHandlerStandardPsPostScriptHandlerProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqDamHandlerStandardPsPostScriptHandlerInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqDamHandlerStandardPsPostScriptHandlerInfo()
        {
        }

        private ComDayCqDamHandlerStandardPsPostScriptHandlerInfo(string Pid, string Title, string Description, ComDayCqDamHandlerStandardPsPostScriptHandlerProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqDamHandlerStandardPsPostScriptHandlerInfo.
        /// </summary>
        /// <returns>ComDayCqDamHandlerStandardPsPostScriptHandlerInfoBuilder</returns>
        public static ComDayCqDamHandlerStandardPsPostScriptHandlerInfoBuilder Builder()
        {
            return new ComDayCqDamHandlerStandardPsPostScriptHandlerInfoBuilder();
        }

        /// <summary>
        /// Returns ComDayCqDamHandlerStandardPsPostScriptHandlerInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqDamHandlerStandardPsPostScriptHandlerInfoBuilder</returns>
        public ComDayCqDamHandlerStandardPsPostScriptHandlerInfoBuilder With()
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

        public bool Equals(ComDayCqDamHandlerStandardPsPostScriptHandlerInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqDamHandlerStandardPsPostScriptHandlerInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqDamHandlerStandardPsPostScriptHandlerInfo</param>
        /// <param name="right">Compared (ComDayCqDamHandlerStandardPsPostScriptHandlerInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqDamHandlerStandardPsPostScriptHandlerInfo left, ComDayCqDamHandlerStandardPsPostScriptHandlerInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqDamHandlerStandardPsPostScriptHandlerInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqDamHandlerStandardPsPostScriptHandlerInfo</param>
        /// <param name="right">Compared (ComDayCqDamHandlerStandardPsPostScriptHandlerInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqDamHandlerStandardPsPostScriptHandlerInfo left, ComDayCqDamHandlerStandardPsPostScriptHandlerInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqDamHandlerStandardPsPostScriptHandlerInfo.
        /// </summary>
        public sealed class ComDayCqDamHandlerStandardPsPostScriptHandlerInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComDayCqDamHandlerStandardPsPostScriptHandlerProperties _Properties;

            internal ComDayCqDamHandlerStandardPsPostScriptHandlerInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqDamHandlerStandardPsPostScriptHandlerInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComDayCqDamHandlerStandardPsPostScriptHandlerInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqDamHandlerStandardPsPostScriptHandlerInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComDayCqDamHandlerStandardPsPostScriptHandlerInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqDamHandlerStandardPsPostScriptHandlerInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComDayCqDamHandlerStandardPsPostScriptHandlerInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqDamHandlerStandardPsPostScriptHandlerInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComDayCqDamHandlerStandardPsPostScriptHandlerInfoBuilder Properties(ComDayCqDamHandlerStandardPsPostScriptHandlerProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqDamHandlerStandardPsPostScriptHandlerInfo.
            /// </summary>
            /// <returns>ComDayCqDamHandlerStandardPsPostScriptHandlerInfo</returns>
            public ComDayCqDamHandlerStandardPsPostScriptHandlerInfo Build()
            {
                Validate();
                return new ComDayCqDamHandlerStandardPsPostScriptHandlerInfo(
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