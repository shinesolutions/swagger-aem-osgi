using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqWcmCoreImplReferencesContentContentReferenceConfigInfo
    /// </summary>
    public sealed class ComDayCqWcmCoreImplReferencesContentContentReferenceConfigInfo:  IEquatable<ComDayCqWcmCoreImplReferencesContentContentReferenceConfigInfo>
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
        public ComDayCqWcmCoreImplReferencesContentContentReferenceConfigProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqWcmCoreImplReferencesContentContentReferenceConfigInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqWcmCoreImplReferencesContentContentReferenceConfigInfo()
        {
        }

        private ComDayCqWcmCoreImplReferencesContentContentReferenceConfigInfo(string Pid, string Title, string Description, ComDayCqWcmCoreImplReferencesContentContentReferenceConfigProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqWcmCoreImplReferencesContentContentReferenceConfigInfo.
        /// </summary>
        /// <returns>ComDayCqWcmCoreImplReferencesContentContentReferenceConfigInfoBuilder</returns>
        public static ComDayCqWcmCoreImplReferencesContentContentReferenceConfigInfoBuilder Builder()
        {
            return new ComDayCqWcmCoreImplReferencesContentContentReferenceConfigInfoBuilder();
        }

        /// <summary>
        /// Returns ComDayCqWcmCoreImplReferencesContentContentReferenceConfigInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqWcmCoreImplReferencesContentContentReferenceConfigInfoBuilder</returns>
        public ComDayCqWcmCoreImplReferencesContentContentReferenceConfigInfoBuilder With()
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

        public bool Equals(ComDayCqWcmCoreImplReferencesContentContentReferenceConfigInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqWcmCoreImplReferencesContentContentReferenceConfigInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqWcmCoreImplReferencesContentContentReferenceConfigInfo</param>
        /// <param name="right">Compared (ComDayCqWcmCoreImplReferencesContentContentReferenceConfigInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqWcmCoreImplReferencesContentContentReferenceConfigInfo left, ComDayCqWcmCoreImplReferencesContentContentReferenceConfigInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqWcmCoreImplReferencesContentContentReferenceConfigInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqWcmCoreImplReferencesContentContentReferenceConfigInfo</param>
        /// <param name="right">Compared (ComDayCqWcmCoreImplReferencesContentContentReferenceConfigInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqWcmCoreImplReferencesContentContentReferenceConfigInfo left, ComDayCqWcmCoreImplReferencesContentContentReferenceConfigInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqWcmCoreImplReferencesContentContentReferenceConfigInfo.
        /// </summary>
        public sealed class ComDayCqWcmCoreImplReferencesContentContentReferenceConfigInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComDayCqWcmCoreImplReferencesContentContentReferenceConfigProperties _Properties;

            internal ComDayCqWcmCoreImplReferencesContentContentReferenceConfigInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqWcmCoreImplReferencesContentContentReferenceConfigInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComDayCqWcmCoreImplReferencesContentContentReferenceConfigInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqWcmCoreImplReferencesContentContentReferenceConfigInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComDayCqWcmCoreImplReferencesContentContentReferenceConfigInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqWcmCoreImplReferencesContentContentReferenceConfigInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComDayCqWcmCoreImplReferencesContentContentReferenceConfigInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqWcmCoreImplReferencesContentContentReferenceConfigInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComDayCqWcmCoreImplReferencesContentContentReferenceConfigInfoBuilder Properties(ComDayCqWcmCoreImplReferencesContentContentReferenceConfigProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqWcmCoreImplReferencesContentContentReferenceConfigInfo.
            /// </summary>
            /// <returns>ComDayCqWcmCoreImplReferencesContentContentReferenceConfigInfo</returns>
            public ComDayCqWcmCoreImplReferencesContentContentReferenceConfigInfo Build()
            {
                Validate();
                return new ComDayCqWcmCoreImplReferencesContentContentReferenceConfigInfo(
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