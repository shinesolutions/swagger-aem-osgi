using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqDamScene7ImplScene7UploadServiceImplInfo
    /// </summary>
    public sealed class ComDayCqDamScene7ImplScene7UploadServiceImplInfo:  IEquatable<ComDayCqDamScene7ImplScene7UploadServiceImplInfo>
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
        public ComDayCqDamScene7ImplScene7UploadServiceImplProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqDamScene7ImplScene7UploadServiceImplInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqDamScene7ImplScene7UploadServiceImplInfo()
        {
        }

        private ComDayCqDamScene7ImplScene7UploadServiceImplInfo(string Pid, string Title, string Description, ComDayCqDamScene7ImplScene7UploadServiceImplProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqDamScene7ImplScene7UploadServiceImplInfo.
        /// </summary>
        /// <returns>ComDayCqDamScene7ImplScene7UploadServiceImplInfoBuilder</returns>
        public static ComDayCqDamScene7ImplScene7UploadServiceImplInfoBuilder Builder()
        {
            return new ComDayCqDamScene7ImplScene7UploadServiceImplInfoBuilder();
        }

        /// <summary>
        /// Returns ComDayCqDamScene7ImplScene7UploadServiceImplInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqDamScene7ImplScene7UploadServiceImplInfoBuilder</returns>
        public ComDayCqDamScene7ImplScene7UploadServiceImplInfoBuilder With()
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

        public bool Equals(ComDayCqDamScene7ImplScene7UploadServiceImplInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqDamScene7ImplScene7UploadServiceImplInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqDamScene7ImplScene7UploadServiceImplInfo</param>
        /// <param name="right">Compared (ComDayCqDamScene7ImplScene7UploadServiceImplInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqDamScene7ImplScene7UploadServiceImplInfo left, ComDayCqDamScene7ImplScene7UploadServiceImplInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqDamScene7ImplScene7UploadServiceImplInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqDamScene7ImplScene7UploadServiceImplInfo</param>
        /// <param name="right">Compared (ComDayCqDamScene7ImplScene7UploadServiceImplInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqDamScene7ImplScene7UploadServiceImplInfo left, ComDayCqDamScene7ImplScene7UploadServiceImplInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqDamScene7ImplScene7UploadServiceImplInfo.
        /// </summary>
        public sealed class ComDayCqDamScene7ImplScene7UploadServiceImplInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComDayCqDamScene7ImplScene7UploadServiceImplProperties _Properties;

            internal ComDayCqDamScene7ImplScene7UploadServiceImplInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqDamScene7ImplScene7UploadServiceImplInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComDayCqDamScene7ImplScene7UploadServiceImplInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqDamScene7ImplScene7UploadServiceImplInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComDayCqDamScene7ImplScene7UploadServiceImplInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqDamScene7ImplScene7UploadServiceImplInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComDayCqDamScene7ImplScene7UploadServiceImplInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqDamScene7ImplScene7UploadServiceImplInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComDayCqDamScene7ImplScene7UploadServiceImplInfoBuilder Properties(ComDayCqDamScene7ImplScene7UploadServiceImplProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqDamScene7ImplScene7UploadServiceImplInfo.
            /// </summary>
            /// <returns>ComDayCqDamScene7ImplScene7UploadServiceImplInfo</returns>
            public ComDayCqDamScene7ImplScene7UploadServiceImplInfo Build()
            {
                Validate();
                return new ComDayCqDamScene7ImplScene7UploadServiceImplInfo(
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