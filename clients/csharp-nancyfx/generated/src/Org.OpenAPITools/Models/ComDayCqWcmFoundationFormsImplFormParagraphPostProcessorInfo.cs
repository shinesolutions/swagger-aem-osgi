using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqWcmFoundationFormsImplFormParagraphPostProcessorInfo
    /// </summary>
    public sealed class ComDayCqWcmFoundationFormsImplFormParagraphPostProcessorInfo:  IEquatable<ComDayCqWcmFoundationFormsImplFormParagraphPostProcessorInfo>
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
        public ComDayCqWcmFoundationFormsImplFormParagraphPostProcessorProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqWcmFoundationFormsImplFormParagraphPostProcessorInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqWcmFoundationFormsImplFormParagraphPostProcessorInfo()
        {
        }

        private ComDayCqWcmFoundationFormsImplFormParagraphPostProcessorInfo(string Pid, string Title, string Description, ComDayCqWcmFoundationFormsImplFormParagraphPostProcessorProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqWcmFoundationFormsImplFormParagraphPostProcessorInfo.
        /// </summary>
        /// <returns>ComDayCqWcmFoundationFormsImplFormParagraphPostProcessorInfoBuilder</returns>
        public static ComDayCqWcmFoundationFormsImplFormParagraphPostProcessorInfoBuilder Builder()
        {
            return new ComDayCqWcmFoundationFormsImplFormParagraphPostProcessorInfoBuilder();
        }

        /// <summary>
        /// Returns ComDayCqWcmFoundationFormsImplFormParagraphPostProcessorInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqWcmFoundationFormsImplFormParagraphPostProcessorInfoBuilder</returns>
        public ComDayCqWcmFoundationFormsImplFormParagraphPostProcessorInfoBuilder With()
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

        public bool Equals(ComDayCqWcmFoundationFormsImplFormParagraphPostProcessorInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqWcmFoundationFormsImplFormParagraphPostProcessorInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqWcmFoundationFormsImplFormParagraphPostProcessorInfo</param>
        /// <param name="right">Compared (ComDayCqWcmFoundationFormsImplFormParagraphPostProcessorInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqWcmFoundationFormsImplFormParagraphPostProcessorInfo left, ComDayCqWcmFoundationFormsImplFormParagraphPostProcessorInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqWcmFoundationFormsImplFormParagraphPostProcessorInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqWcmFoundationFormsImplFormParagraphPostProcessorInfo</param>
        /// <param name="right">Compared (ComDayCqWcmFoundationFormsImplFormParagraphPostProcessorInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqWcmFoundationFormsImplFormParagraphPostProcessorInfo left, ComDayCqWcmFoundationFormsImplFormParagraphPostProcessorInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqWcmFoundationFormsImplFormParagraphPostProcessorInfo.
        /// </summary>
        public sealed class ComDayCqWcmFoundationFormsImplFormParagraphPostProcessorInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComDayCqWcmFoundationFormsImplFormParagraphPostProcessorProperties _Properties;

            internal ComDayCqWcmFoundationFormsImplFormParagraphPostProcessorInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqWcmFoundationFormsImplFormParagraphPostProcessorInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComDayCqWcmFoundationFormsImplFormParagraphPostProcessorInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqWcmFoundationFormsImplFormParagraphPostProcessorInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComDayCqWcmFoundationFormsImplFormParagraphPostProcessorInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqWcmFoundationFormsImplFormParagraphPostProcessorInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComDayCqWcmFoundationFormsImplFormParagraphPostProcessorInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqWcmFoundationFormsImplFormParagraphPostProcessorInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComDayCqWcmFoundationFormsImplFormParagraphPostProcessorInfoBuilder Properties(ComDayCqWcmFoundationFormsImplFormParagraphPostProcessorProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqWcmFoundationFormsImplFormParagraphPostProcessorInfo.
            /// </summary>
            /// <returns>ComDayCqWcmFoundationFormsImplFormParagraphPostProcessorInfo</returns>
            public ComDayCqWcmFoundationFormsImplFormParagraphPostProcessorInfo Build()
            {
                Validate();
                return new ComDayCqWcmFoundationFormsImplFormParagraphPostProcessorInfo(
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