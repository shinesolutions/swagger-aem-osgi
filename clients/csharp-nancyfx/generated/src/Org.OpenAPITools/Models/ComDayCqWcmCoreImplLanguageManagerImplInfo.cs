using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqWcmCoreImplLanguageManagerImplInfo
    /// </summary>
    public sealed class ComDayCqWcmCoreImplLanguageManagerImplInfo:  IEquatable<ComDayCqWcmCoreImplLanguageManagerImplInfo>
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
        public ComDayCqWcmCoreImplLanguageManagerImplProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqWcmCoreImplLanguageManagerImplInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqWcmCoreImplLanguageManagerImplInfo()
        {
        }

        private ComDayCqWcmCoreImplLanguageManagerImplInfo(string Pid, string Title, string Description, ComDayCqWcmCoreImplLanguageManagerImplProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqWcmCoreImplLanguageManagerImplInfo.
        /// </summary>
        /// <returns>ComDayCqWcmCoreImplLanguageManagerImplInfoBuilder</returns>
        public static ComDayCqWcmCoreImplLanguageManagerImplInfoBuilder Builder()
        {
            return new ComDayCqWcmCoreImplLanguageManagerImplInfoBuilder();
        }

        /// <summary>
        /// Returns ComDayCqWcmCoreImplLanguageManagerImplInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqWcmCoreImplLanguageManagerImplInfoBuilder</returns>
        public ComDayCqWcmCoreImplLanguageManagerImplInfoBuilder With()
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

        public bool Equals(ComDayCqWcmCoreImplLanguageManagerImplInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqWcmCoreImplLanguageManagerImplInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqWcmCoreImplLanguageManagerImplInfo</param>
        /// <param name="right">Compared (ComDayCqWcmCoreImplLanguageManagerImplInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqWcmCoreImplLanguageManagerImplInfo left, ComDayCqWcmCoreImplLanguageManagerImplInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqWcmCoreImplLanguageManagerImplInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqWcmCoreImplLanguageManagerImplInfo</param>
        /// <param name="right">Compared (ComDayCqWcmCoreImplLanguageManagerImplInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqWcmCoreImplLanguageManagerImplInfo left, ComDayCqWcmCoreImplLanguageManagerImplInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqWcmCoreImplLanguageManagerImplInfo.
        /// </summary>
        public sealed class ComDayCqWcmCoreImplLanguageManagerImplInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComDayCqWcmCoreImplLanguageManagerImplProperties _Properties;

            internal ComDayCqWcmCoreImplLanguageManagerImplInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqWcmCoreImplLanguageManagerImplInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComDayCqWcmCoreImplLanguageManagerImplInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqWcmCoreImplLanguageManagerImplInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComDayCqWcmCoreImplLanguageManagerImplInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqWcmCoreImplLanguageManagerImplInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComDayCqWcmCoreImplLanguageManagerImplInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqWcmCoreImplLanguageManagerImplInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComDayCqWcmCoreImplLanguageManagerImplInfoBuilder Properties(ComDayCqWcmCoreImplLanguageManagerImplProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqWcmCoreImplLanguageManagerImplInfo.
            /// </summary>
            /// <returns>ComDayCqWcmCoreImplLanguageManagerImplInfo</returns>
            public ComDayCqWcmCoreImplLanguageManagerImplInfo Build()
            {
                Validate();
                return new ComDayCqWcmCoreImplLanguageManagerImplInfo(
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