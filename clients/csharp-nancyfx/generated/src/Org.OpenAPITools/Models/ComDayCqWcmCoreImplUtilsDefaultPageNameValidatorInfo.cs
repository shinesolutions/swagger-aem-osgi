using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqWcmCoreImplUtilsDefaultPageNameValidatorInfo
    /// </summary>
    public sealed class ComDayCqWcmCoreImplUtilsDefaultPageNameValidatorInfo:  IEquatable<ComDayCqWcmCoreImplUtilsDefaultPageNameValidatorInfo>
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
        public ComDayCqWcmCoreImplUtilsDefaultPageNameValidatorProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqWcmCoreImplUtilsDefaultPageNameValidatorInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqWcmCoreImplUtilsDefaultPageNameValidatorInfo()
        {
        }

        private ComDayCqWcmCoreImplUtilsDefaultPageNameValidatorInfo(string Pid, string Title, string Description, ComDayCqWcmCoreImplUtilsDefaultPageNameValidatorProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqWcmCoreImplUtilsDefaultPageNameValidatorInfo.
        /// </summary>
        /// <returns>ComDayCqWcmCoreImplUtilsDefaultPageNameValidatorInfoBuilder</returns>
        public static ComDayCqWcmCoreImplUtilsDefaultPageNameValidatorInfoBuilder Builder()
        {
            return new ComDayCqWcmCoreImplUtilsDefaultPageNameValidatorInfoBuilder();
        }

        /// <summary>
        /// Returns ComDayCqWcmCoreImplUtilsDefaultPageNameValidatorInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqWcmCoreImplUtilsDefaultPageNameValidatorInfoBuilder</returns>
        public ComDayCqWcmCoreImplUtilsDefaultPageNameValidatorInfoBuilder With()
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

        public bool Equals(ComDayCqWcmCoreImplUtilsDefaultPageNameValidatorInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqWcmCoreImplUtilsDefaultPageNameValidatorInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqWcmCoreImplUtilsDefaultPageNameValidatorInfo</param>
        /// <param name="right">Compared (ComDayCqWcmCoreImplUtilsDefaultPageNameValidatorInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqWcmCoreImplUtilsDefaultPageNameValidatorInfo left, ComDayCqWcmCoreImplUtilsDefaultPageNameValidatorInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqWcmCoreImplUtilsDefaultPageNameValidatorInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqWcmCoreImplUtilsDefaultPageNameValidatorInfo</param>
        /// <param name="right">Compared (ComDayCqWcmCoreImplUtilsDefaultPageNameValidatorInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqWcmCoreImplUtilsDefaultPageNameValidatorInfo left, ComDayCqWcmCoreImplUtilsDefaultPageNameValidatorInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqWcmCoreImplUtilsDefaultPageNameValidatorInfo.
        /// </summary>
        public sealed class ComDayCqWcmCoreImplUtilsDefaultPageNameValidatorInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComDayCqWcmCoreImplUtilsDefaultPageNameValidatorProperties _Properties;

            internal ComDayCqWcmCoreImplUtilsDefaultPageNameValidatorInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqWcmCoreImplUtilsDefaultPageNameValidatorInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComDayCqWcmCoreImplUtilsDefaultPageNameValidatorInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqWcmCoreImplUtilsDefaultPageNameValidatorInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComDayCqWcmCoreImplUtilsDefaultPageNameValidatorInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqWcmCoreImplUtilsDefaultPageNameValidatorInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComDayCqWcmCoreImplUtilsDefaultPageNameValidatorInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqWcmCoreImplUtilsDefaultPageNameValidatorInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComDayCqWcmCoreImplUtilsDefaultPageNameValidatorInfoBuilder Properties(ComDayCqWcmCoreImplUtilsDefaultPageNameValidatorProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqWcmCoreImplUtilsDefaultPageNameValidatorInfo.
            /// </summary>
            /// <returns>ComDayCqWcmCoreImplUtilsDefaultPageNameValidatorInfo</returns>
            public ComDayCqWcmCoreImplUtilsDefaultPageNameValidatorInfo Build()
            {
                Validate();
                return new ComDayCqWcmCoreImplUtilsDefaultPageNameValidatorInfo(
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