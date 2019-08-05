using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqDamPimImplSourcingUploadProcessProductAssetsUploadProInfo
    /// </summary>
    public sealed class ComDayCqDamPimImplSourcingUploadProcessProductAssetsUploadProInfo:  IEquatable<ComDayCqDamPimImplSourcingUploadProcessProductAssetsUploadProInfo>
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
        public ComDayCqDamPimImplSourcingUploadProcessProductAssetsUploadProProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqDamPimImplSourcingUploadProcessProductAssetsUploadProInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqDamPimImplSourcingUploadProcessProductAssetsUploadProInfo()
        {
        }

        private ComDayCqDamPimImplSourcingUploadProcessProductAssetsUploadProInfo(string Pid, string Title, string Description, ComDayCqDamPimImplSourcingUploadProcessProductAssetsUploadProProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqDamPimImplSourcingUploadProcessProductAssetsUploadProInfo.
        /// </summary>
        /// <returns>ComDayCqDamPimImplSourcingUploadProcessProductAssetsUploadProInfoBuilder</returns>
        public static ComDayCqDamPimImplSourcingUploadProcessProductAssetsUploadProInfoBuilder Builder()
        {
            return new ComDayCqDamPimImplSourcingUploadProcessProductAssetsUploadProInfoBuilder();
        }

        /// <summary>
        /// Returns ComDayCqDamPimImplSourcingUploadProcessProductAssetsUploadProInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqDamPimImplSourcingUploadProcessProductAssetsUploadProInfoBuilder</returns>
        public ComDayCqDamPimImplSourcingUploadProcessProductAssetsUploadProInfoBuilder With()
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

        public bool Equals(ComDayCqDamPimImplSourcingUploadProcessProductAssetsUploadProInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqDamPimImplSourcingUploadProcessProductAssetsUploadProInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqDamPimImplSourcingUploadProcessProductAssetsUploadProInfo</param>
        /// <param name="right">Compared (ComDayCqDamPimImplSourcingUploadProcessProductAssetsUploadProInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqDamPimImplSourcingUploadProcessProductAssetsUploadProInfo left, ComDayCqDamPimImplSourcingUploadProcessProductAssetsUploadProInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqDamPimImplSourcingUploadProcessProductAssetsUploadProInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqDamPimImplSourcingUploadProcessProductAssetsUploadProInfo</param>
        /// <param name="right">Compared (ComDayCqDamPimImplSourcingUploadProcessProductAssetsUploadProInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqDamPimImplSourcingUploadProcessProductAssetsUploadProInfo left, ComDayCqDamPimImplSourcingUploadProcessProductAssetsUploadProInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqDamPimImplSourcingUploadProcessProductAssetsUploadProInfo.
        /// </summary>
        public sealed class ComDayCqDamPimImplSourcingUploadProcessProductAssetsUploadProInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComDayCqDamPimImplSourcingUploadProcessProductAssetsUploadProProperties _Properties;

            internal ComDayCqDamPimImplSourcingUploadProcessProductAssetsUploadProInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqDamPimImplSourcingUploadProcessProductAssetsUploadProInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComDayCqDamPimImplSourcingUploadProcessProductAssetsUploadProInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqDamPimImplSourcingUploadProcessProductAssetsUploadProInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComDayCqDamPimImplSourcingUploadProcessProductAssetsUploadProInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqDamPimImplSourcingUploadProcessProductAssetsUploadProInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComDayCqDamPimImplSourcingUploadProcessProductAssetsUploadProInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqDamPimImplSourcingUploadProcessProductAssetsUploadProInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComDayCqDamPimImplSourcingUploadProcessProductAssetsUploadProInfoBuilder Properties(ComDayCqDamPimImplSourcingUploadProcessProductAssetsUploadProProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqDamPimImplSourcingUploadProcessProductAssetsUploadProInfo.
            /// </summary>
            /// <returns>ComDayCqDamPimImplSourcingUploadProcessProductAssetsUploadProInfo</returns>
            public ComDayCqDamPimImplSourcingUploadProcessProductAssetsUploadProInfo Build()
            {
                Validate();
                return new ComDayCqDamPimImplSourcingUploadProcessProductAssetsUploadProInfo(
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