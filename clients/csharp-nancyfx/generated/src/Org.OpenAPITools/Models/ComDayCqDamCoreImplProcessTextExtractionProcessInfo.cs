using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqDamCoreImplProcessTextExtractionProcessInfo
    /// </summary>
    public sealed class ComDayCqDamCoreImplProcessTextExtractionProcessInfo:  IEquatable<ComDayCqDamCoreImplProcessTextExtractionProcessInfo>
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
        public ComDayCqDamCoreImplProcessTextExtractionProcessProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqDamCoreImplProcessTextExtractionProcessInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqDamCoreImplProcessTextExtractionProcessInfo()
        {
        }

        private ComDayCqDamCoreImplProcessTextExtractionProcessInfo(string Pid, string Title, string Description, ComDayCqDamCoreImplProcessTextExtractionProcessProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqDamCoreImplProcessTextExtractionProcessInfo.
        /// </summary>
        /// <returns>ComDayCqDamCoreImplProcessTextExtractionProcessInfoBuilder</returns>
        public static ComDayCqDamCoreImplProcessTextExtractionProcessInfoBuilder Builder()
        {
            return new ComDayCqDamCoreImplProcessTextExtractionProcessInfoBuilder();
        }

        /// <summary>
        /// Returns ComDayCqDamCoreImplProcessTextExtractionProcessInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqDamCoreImplProcessTextExtractionProcessInfoBuilder</returns>
        public ComDayCqDamCoreImplProcessTextExtractionProcessInfoBuilder With()
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

        public bool Equals(ComDayCqDamCoreImplProcessTextExtractionProcessInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqDamCoreImplProcessTextExtractionProcessInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqDamCoreImplProcessTextExtractionProcessInfo</param>
        /// <param name="right">Compared (ComDayCqDamCoreImplProcessTextExtractionProcessInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqDamCoreImplProcessTextExtractionProcessInfo left, ComDayCqDamCoreImplProcessTextExtractionProcessInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqDamCoreImplProcessTextExtractionProcessInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqDamCoreImplProcessTextExtractionProcessInfo</param>
        /// <param name="right">Compared (ComDayCqDamCoreImplProcessTextExtractionProcessInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqDamCoreImplProcessTextExtractionProcessInfo left, ComDayCqDamCoreImplProcessTextExtractionProcessInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqDamCoreImplProcessTextExtractionProcessInfo.
        /// </summary>
        public sealed class ComDayCqDamCoreImplProcessTextExtractionProcessInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComDayCqDamCoreImplProcessTextExtractionProcessProperties _Properties;

            internal ComDayCqDamCoreImplProcessTextExtractionProcessInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqDamCoreImplProcessTextExtractionProcessInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComDayCqDamCoreImplProcessTextExtractionProcessInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqDamCoreImplProcessTextExtractionProcessInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComDayCqDamCoreImplProcessTextExtractionProcessInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqDamCoreImplProcessTextExtractionProcessInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComDayCqDamCoreImplProcessTextExtractionProcessInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqDamCoreImplProcessTextExtractionProcessInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComDayCqDamCoreImplProcessTextExtractionProcessInfoBuilder Properties(ComDayCqDamCoreImplProcessTextExtractionProcessProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqDamCoreImplProcessTextExtractionProcessInfo.
            /// </summary>
            /// <returns>ComDayCqDamCoreImplProcessTextExtractionProcessInfo</returns>
            public ComDayCqDamCoreImplProcessTextExtractionProcessInfo Build()
            {
                Validate();
                return new ComDayCqDamCoreImplProcessTextExtractionProcessInfo(
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